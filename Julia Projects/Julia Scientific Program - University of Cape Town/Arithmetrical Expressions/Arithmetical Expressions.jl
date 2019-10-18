# Arithmetical Expressions

1-2+3-4
1/2+3/4
1/(2+3)/4
1/(2+3/4)
(1/2+3)/4

# first inside the inner parentesis,
# than exponatiation,
# than multiplication,
# than adition and substraction

println(1/2/3) # left to right
println(2-3+4)
println(2/3^2)
println(3-2/4)
println(3+2*9-6)

# int64 and Float64, combining them can be a bad idea!
# this case above can make julia slow!
0.2+0.1-3*6.7/4-1-2*3
# most correct way as above
0.2+0.1-((3*6.7)/4)-1-(2*3)

println(3^2^3)
println((3^2)^3)

# julia allows to have extremely long counts
