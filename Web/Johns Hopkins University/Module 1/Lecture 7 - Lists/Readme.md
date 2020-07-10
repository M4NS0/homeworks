## Lists



```html 
    <!DOCTYPE html>
    <html lang="en">
    <head>
        <meta charset="UTF-8">
        <title>Unordered Lists</title>
    </head>
    <body>
        <div>
            My typical dinner list:
            Milk
            Donuts
            Cookies
                Chocolate
                Sugar
                Peanut butter
            Pepto Bismol
        </div>
    </body>
    </html>

```

> LI
> List

> Ul
> Unordered List

```html
    <!DOCTYPE html>
    <html lang="en">
    <head>
        <meta charset="UTF-8">
        <title>Unordered Lists</title>
    </head>
    <body>
        <div>
        My typical dinner list:
            <ul>  
                <li>Item 1</li>
                <li>Item 2</li>
                <li>Item 3
                    <ul>
                        <li>Nested item 1</li>
                        <li>Nested item 2</li>
                        <li>Nested item 3</li>
                    </ul>
                </li>
                <li>Item 4</li>
            </ul>
        </div>
    </body>
    </html>

```
> If, for exemple Item 4 is not between list tags an error will ocurre:

```html
Error: Text not allowed in element ul in this context.
From line 20, column 1; to line 20, column 22

    </li>↩ Item 4↩     

Content model for element ul:
Zero or more li and script-supporting elements.

```
> OL
> Ordered List

```html
    <!DOCTYPE html>
    <html lang="en">
    <head>
        <meta charset="UTF-8">
        <title>Ordered List</title>
    </head>
    <body>
        <h1>Ordered List</h1>
        <div>
            Oreo cockie eating procedure:
            <ol>
                <li>Open box</li>
                <li>Take out Cookie</li>
                <li>Make a double Oreo
                    <ol>
                        <li>Peel of the top part</li>
                        <li>Place another cookie in the middle</li>
                        <li>Put back the top part</li>
                    </ol>
                </li>
                <li>Enjoy!</li>
            </ol>
        </div>
    </body>
    </html>

```
> - *Lists provide a natural and commonly used grouping of content*
> - *Very often, lists are used for structuring navigation portions od the web page*