### The Box Model, Part I

<img src="css-box-model.png"  width="80%" height="auto" />

```css 
    body {
        margin: 0;
        padding: 0;
        background-color: gray;
    }
    #box {
        background-color: #DDA8DD;
        padding: 10px 30px 10px 30px;
        border: 20px solid #F0E68C;
        margin: 40px;
        width: 325px;
        box-sizing: border-box;
    }

    #content {
        background-color: #00BFFF;
    }

```

> *Border-box ensures that the sizing of box do not exceed the size of box after stylization*
> *Inheritance is not alowed*