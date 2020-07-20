
### Absolute Positioning

All offsets(top, bottom, left, right) are relative to the position of the nearest ancestor which has positioning set on it, other than static


```css 
    * {
        box-sizing: border-box;
        margin: 0;
        padding: 0;
    }
    
    h1 {
        margin-bottom: 15px;
    }
    
    div#container {
        background-color: grey;
    }
    
    p {
        width: 50px;
        height: 50px;
        border: 1px solid black;
        margin-bottom: 15px;
    }
    
    #p1 {
        background-color: #a52a2a;
    }
    
    #p2 {
        background-color: #deb887;
    }
    
    #p3 {
        background-color: #5f9ea0;
    }
    
    #p4 {
        background-color: #ff7f50;
    }
```

```html 
    <body>
        <h1>Positioning Elements</h1>
        <div id="container">
            <p id="p1"></p>
            <p id="p2"></p>
            <p id="p3"></p>
            <p id="p4"></p>
        </div>
    </body>
```

> - *By default, html is the only element that has non-static positioning set on it (relative)*
> - *Element is taken out of the normal document flow*
> 
> Offsetting the relative container element offsets it's contents as well:

```css
    div#container {
        background-color: grey;
        position: relative;
        top: 60px;
    }

    p {
        width: 50px;
        height: 50px;
        border: 1px solid black;
        margin-bottom: 15px;
    }

    #p1 {
        background-color: #a52a2a;
        position: relative;
        top: 65px;
        left: 65px;
    }

    #p2 {
        background-color: #deb887;
    }

    #p3 {
        background-color: #5f9ea0;
        position: absolute;
        top: 0;
        left: 0;
    }
```
