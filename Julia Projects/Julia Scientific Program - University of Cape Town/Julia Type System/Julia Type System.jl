# Julia's Type System
# Types are formats to store an information
# Wen u store information u must specify the type

typeof(1)
typeof(1+2+3)
typeof("Hello!")
typeof("H")
typeof('H')
typeof(1+1.3)

# both are 64 bits to represent a number
# Type Char and Strings
# Strings is a buck of Strings
println("αβ ⨦ γ") # ⋄ \diamond and ♢ \diamondsuit
typeof("αβ ⨦ γ")  # \alpha \gama \beta

# types allways starts with Capital in first letter
typeof(true)
typeof(false)
typeof(2.)
typeof(2)

2.0 == 2
2<2/3 # 2/3 is not a Int64
2.0 === 2

'a' == "a"

# Concrete and abstract types
# all types above are concrete, they have no subtypes
# Float64 has the supertype Real
# Int64 has the supertype Signed
# Signed has the supertype Integer
# Integer has the supertype Real
