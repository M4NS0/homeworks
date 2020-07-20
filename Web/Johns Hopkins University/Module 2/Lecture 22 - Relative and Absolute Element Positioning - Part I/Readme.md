### Relative and Absolute Element Positioning - Part I

> - Is alternative to document Flow
> - New Positioning Schemes
> - Precise offsets to move elements do a different part of the page

<br>

###### Static Positioning:

Normal document flow

> Default for all, except html:
>   - *Positioning offsets are ignored*

<br>

### Relative Positioning:

Elemtent is positioned relative to its position in normal document flow position

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
        position: relative;
        top: 65px;
        left: 65px;
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


> Positioning CSS (offset) proprieties
>   - *top, bottom, left, right*
>
> The element is NOT taken out of normal document flow
>  - *Even if move, it's original spot is preserved*
>
>
> *Relativing position will unanchor the element in page*
> *It allows to move FROM top (50px) and FROM left (50px)*
> 
> *Negative numbers can be used*

<br>
