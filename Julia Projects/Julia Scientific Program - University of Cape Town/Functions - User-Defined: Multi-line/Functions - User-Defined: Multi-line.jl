# please do not execute all code togheter inless if you want just
# the first block, or in worst case, an arror

function nextFunc(a,b,c)
  a*b + c
end
println(nextFunc(7.0,5,3))


function test(input)
    println("$input"^2)
end
test(2)

function coordinates(x, y=0, z=0)
    println("($x, $y, $z)")
end
coordinates(1,0,2)

function showDebugPrintln(testVar)

    # next line will announce where is the report is coming from
    println("inside the showDebugPrintln() now")

    # next line will reports what value, what type
    println("The type of testVar is $(typeof(testVar))
                and the value of  testVar is $testVar")
end

a = ['1',2.]
showDebugPrintln((a))
# Output:
# inside the showDebugPrintln() now
# The type of testVar is Array{Any,1}
# and the value of  testVar is Any['1', 2.0]
