### Conflict Resolution - Part 1
##
#### Cascade of CSS
#### Origin Precedence 
##
###### When in conflict:

> **last** Declaration Wins
> 
> *The reason is because HTML is Top-Bottom Processed*
>
> *For precedence, think of external CSS as declarated at the spot where it's linked to*
#
###### When no conflict:

> Declaration merge
> *The elemet will get all merged attributes*

```html
    <!DOCTYPE html>
    <html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Cascade of CSS</title>
        <link rel="stylesheet" href="external.css">
        <style>
            p {
                color: maroon;
                /* Origin */
            }
        </style>
    </head>
    <body>
        <h1>Origin Exemple</h1>
        <p>
            
            <br>color="maroon";font-size="120%";background-color="grey"</p>
        <p style="color:black;">
        <br>color="black";font-size="120%";background-color="grey"</p>
    </body>
    </html>

```

```css
    p {
        font-size: 130%;
        background-color: grey;
        color: whitesmoke;
    }
```

###### Inheritance

*Inheritance allow to write more global styles on <br>parent elements and then "fine-tune" the styles <br> for some of the child elements as needed.  <br> Such approach makes writing CSS very efficient.*

> DOM Tree
```html
    <body>
        <element>
            <element>
            </element>
        </element>
    </body>
```
> A child tag or a child of a child tag will inherit the style of father tag
