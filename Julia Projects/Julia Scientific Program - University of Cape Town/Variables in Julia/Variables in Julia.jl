    # Variables in Julia
    # name value and type

# julia hates empty arrays!

Array{Int64}(undef, 3)
display(Array{Int64}(undef, 3))
# has 3 element array in undefined type
display(Array{Int64, 5})
# has 5 element array in Int64 type
display(Array{String, 1})

greeting = "Hello, Julia!"
println(greeting)

ξ = 20
λ = 11.1111

# its not a variable that has a type, its the value of the variables that has!
absTypeVariable = Array{Integer}(undef, 2,3)
display(absTypeVariable)
typeof(absTypeVariable)

Array{Integer,2}
display(Array{Integer,2})

absTypeVariable[1,1] = 1
display(absTypeVariable)

absTypeVariable[1,2] = 5
display(absTypeVariable)

# absTypeVariable[2,2] = "omg, is a string!"

arbConcreteVariable = Array{Int64}(undef,2,3)
display(arbConcreteVariable) # julia will set arbitrary numbers

newArray = Array{Float64,3}

a = Array{Integer,2}(undef, 2, 2)

x = Array{Int64}(undef,11, 12)
