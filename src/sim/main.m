clear all; close all; clc;

earth_m = 5.97237e24;
earth_r = 6371000;
moon_m = 7.342e22;
moon_a = 384399000;
saturn_m = 95.159*earth_m;
saturn_r = 58232000;

position = [
    0 moon_a moon_a/3
    moon_a 0 moon_a/2
]';
position = moon_a * rand(7,2);

velocity = zeros(size(position));

initial_conditions = [position(:); velocity(:)];

t = [0 1000000];
[t, path] = ode15s(@(t, state) step(0, earth_m, saturn_r, earth_r, state), t, initial_conditions);

figure; hold on; axis square;
for i = 1:2:2*size(position,1)-1
    plot3(path(:, i)/moon_a, path(:, i+1)/moon_a, t);
end