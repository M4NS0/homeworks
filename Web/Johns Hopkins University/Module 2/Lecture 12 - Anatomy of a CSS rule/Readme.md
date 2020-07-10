### Anatomy of a CSS Rule

> Syntax of a CSS Rule
> - *Selector*
> - *Declaration*
> - *Property/value pair*
> 
> Style Sheet

```css
    p {
        color: blue;
    }
```
> *Selector:  'p'
> Declaration: 'color:blue;'
> Property: 'color'
> Value: 'blue'*
>
> *Declaration is separeted by a colon and finished with a semicolon*

```css
    p {
        color: blue;
        font-size: 20px;
        width: 200px;
    }

    h1 {
        color: green;
        font-size: 36px;
        text-align: center;
    }
```
> *A selector can contains 0 to many declarations*
>
> *The collection of declarations is called Stylesheet*

```html
    <!DOCTYPE html>
    <html lang="en">

    <head>
        <meta charset="UTF-8">
        <title>Anatomy of a CSS Rule</title>
        <style>
            p {
                color: blue;
                font-size: 20px;
                width: 200px;
            }
            h1 {
                color: green;
                font-size: 36px;
                text-align: center;
            }
        </style>
    </head>
    <h1>Anatomy of a CSS Rule</h1>
    <h2>Subheading 1</h2>
    <p>
        Mussum Ipsum, cacilds vidis litro abertis. Interagi no mé, cursus quis, vehicula ac nisi. 
    </p>
    <h2>Subheading 2</h2>
    <p>
       Viva Forevis aptent taciti sociosqu ad litora torquent. Praesent vel viverra nisi.  
    </p>
    <body>
    </body>
    </html>
```

