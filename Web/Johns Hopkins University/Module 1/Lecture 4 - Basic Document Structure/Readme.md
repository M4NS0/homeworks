### Basic HTML Document Structure

# 
> - *Declaring a html*
> - *Tells the browser that the document is ready for render a HTML*
> - *Distinguish between the complied and not complied pages*
```html
    <!doctype html> 

```
> - *Html Tag: contains whole html document*
```html
    <!doctype html> 
    <html> </html>

```
> - *Head Tag: Describe content of the page*
```html
    <!doctype html> 
    <html>
    <head> </head>
    </html>

```
> - *Meta Tag: specify the character set*
> - *Is stand alone, do not close it*
```html
    <!doctype html> 
    <html>
    <head> 
    <meta charset="utf-8">
    </head>
    </html>

```
> - *Title Tag: is required to make it work*
```html
    <!doctype html> 
    <html>
    <head> 
    <meta charset="utf-8">
    <title> Page Exemple </title>
    </head>
    </html>

```
> - *Body Tag: content that is visible to the user*
```html
    <!doctype html> 
    <html>
    <head> 
    <meta charset="utf-8">
    <title> Page Exemple </title>
    </head>
    <body>
        Bla-bla-bla goes here
    </body>
    </html>

```
Is a good practice to validate the html content to see if it is under conformity:  *[Markup Validation Service](https://validator.w3.org/)*

> - *Nesting contents in a wrong way*
```html
    <!doctype html> 
    <html>
    <head> 
    <meta charset="utf-8">
    <title> Page Exemple </title>
    </head>
    <body>
        <p>Bla-bla-bla <span> goes </p> here </span> 
    </body>
    </html>

```
> - *Running the validator with the code above, we will have:*
```html
    Error: End tag p seen, but there were open elements.
    From line 8, column 36; to line 8, column 39
    pan> goes </p> here 

    Error: Unclosed element span.
    From line 8, column 24; to line 8, column 29
    a-bla-bla <span> goes 

    Error: Stray end tag span.
    From line 8, column 46; to line 8, column 52
    </p> here </span> ↩    

```