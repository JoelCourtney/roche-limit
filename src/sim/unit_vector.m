function [v] = unit_vector(v)
n = norm(v);
if n ~= 0
    v = v/n;
end
end

