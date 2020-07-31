### Passing Variables by Value vs by Reference


###### Passing (or Copying) by Value
Given b=a, passing/copying by value means changing copied value 
in 'b' does not affect the value stored in 'a' and visa-versa

###### Passing (or Copying) by Reference
Given b=a, passing/copying by reference means changing copied value
in 'b' does affect the value stored in 'a' and visa-versa

> Primitives are passed by value, 
> Objects are passed by Reference
>
> "Under the hood", everything is actually passed by value

<br>

###### Memory Allocation

|Primitives|Objects       |
|----------|--------------|
|var a = 7;|var a = {x:7};|
|var b = a;|var b = a;    |
|<img src="pic1.png" width="100%" height="auto" />|<img src="pic3.png" width="100%" height="auto" /> |
|<img src="pic2.png" width="100%" height="auto" />| <img src="pic4.png" width="100%" height="auto" />

> 'b' ends up with the same value as 'a'

