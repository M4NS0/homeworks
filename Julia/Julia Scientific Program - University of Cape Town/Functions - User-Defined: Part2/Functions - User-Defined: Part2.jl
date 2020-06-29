# Functions with multiples methods
myCos(x) = cos(x)
println(myCos(0.7))

myCos(adj, hyp) = adj/hyp
myCos(12,13) # tho cosine of the smaller angle in a standard 5, 12, 13 triangle

println(methods(myCos))
# search for  good style on Julia

# blocks above and blocks beyond must not be executed togheter
myCos(thet :: Float64)  = cos(thet)
myCos(hyp,adj)          = adj/hyp
println(myCos(1))
