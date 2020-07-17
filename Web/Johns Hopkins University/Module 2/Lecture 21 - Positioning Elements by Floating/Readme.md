### Positioning Elements by Floating

```css
   
    p {
        width: 50px;
        height: 50px;
        border: 1px solid black;
        float: left;
        margin-right: 10px;
    }

```

```html
    <body>
        <div>
            <h1>Floating Element</h1>
            <p id="p1"></p>
            <p id="p2"></p>
            <p id="p3"></p>
            <p id="p4"></p>
            <section>This is a regular continuing after the paragraph boxex.</section>
        </div>
    </body>

```

> - Floating elements are taken out of normal document flow
> - It collapses in height
> - Sourrounds the last section elements
> - Floats don't have vertical margin collapse
> 
> *To make it right, use:*
```css 
    section {
        clear: left;
    }
```
> *Clearing to left will tell the browser that the section is announcing that nothing nothing should be allowed to be flowing to the left of it*
> 
> *This can be applied on the 2nd box, to resume the next floating element, adding clear: left to the selector*
```css
    #p3 {
        clear: left;
    }
```
> *So box number 3 moves to the next line and floated to the left*
>
> *To ensure that the boxes won't override themselves, clear both can be used:*

```css 


    p {
        width: 50px;
        height: 50px;
        border: 1px solid black;
    }

    #p1 {
        background-color: #a52a2a;
        float: left;
        height: 150px;
    }

    #p2 {
        background-color: #deb887;
        float: right;
        height: 100px;
    }

    #p3 {
        background-color: #5f9ea0;
        clear: both; 
    }

    section {
        clear: left;
    }
```
> *So p3 won't be overrided by p2 even if it's a tall element*

<br>
<br>

###### Two Column Design:

```html 
    <body>
        <h1>Title</h1>
        <div>
            <p id="p1">
                Column 1
            </p>
            <p id="p2">
               Column 2
            </p>
            <section>Footer</section>
        </div>
    </body>

```

```css 

    * {
        box-sizing: border-box; 
    }

    p {
        width: 50%;
        border: 1px solid black;
        float: left;
        padding: 10px;
    }

    section {
        clear: left;
    }
```

> - *Clearing left will consider the border as a element,*
> *with its own border, margin and not resizable with the*
> *correct width, and the column two goes to next line*
<br>
> - *But if you tells the browser that all elements (star*
> *selector) is a border box, so whole document will ajust* 
> *using the right width*


