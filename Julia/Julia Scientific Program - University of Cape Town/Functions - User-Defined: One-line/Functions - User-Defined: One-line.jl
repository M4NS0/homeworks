# One-line Function definition
# beyond we can notice a new function myFunc that
# holds a multiplication with the variable firstVar
myFunc(firstVar) = 20*firstVar
print(myFunc)

# a new function mus be a valid variable name
# also the arguments of the function
# argments must be between parentheses
display(myFunc(333.2222))

addToy(x, y) = x + y
addToy(10,20.0)
# mixing 2 types of numbers can make Julia slow!
addone(x::Int64) = x + 1
println(addone(10))

a,b = 1,2
b = a
a = b
println(a)

add2(x,y) = x + 2
println(add2(5, 7))

add2(x,y) = x + y
println(add2(5, 7))
