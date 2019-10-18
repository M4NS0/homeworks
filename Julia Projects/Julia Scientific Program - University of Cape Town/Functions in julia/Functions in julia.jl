greeting = "Hello, Julia!"
println(greeting)

a, b, c = cos(0.2), log(10), abs(-1.22)
println(a)
display(b)
print(c)

# Type of is a function and provides us information
# ? (function) / ?help must be typed on terminal

# Built-in Mathematical Functions
# there are more functions than a scientific calculator

atan(10,20) # angles
typeof(cos(1))
typeof(cos(1.))

print(methods(muladd))
# examples of multiple dispatch
# muladd have 17 methods
# Float16, Float64, Float32, Complex, Real, Number

print(methods(60\5040))
print(60\5040)
print(60/5040)
