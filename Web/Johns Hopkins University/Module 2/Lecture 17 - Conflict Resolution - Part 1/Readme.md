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
            }
        </style>
    </head>
    <body>
        <h1>Origin Exemple</h1>
        <p>color="maroon";font-size="120%";background-color="grey"</p>
        <p style="color:black;">color="black";font-size="120%";background-color="grey"</p>
    </body>
    </html>
```