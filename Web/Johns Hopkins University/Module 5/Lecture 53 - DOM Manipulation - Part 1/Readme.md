### Documment Obect Model Manitpulation (DOM) - Part I

> Browsers development tools can access a project DOM in it's console

from [W3Schools](https://www.w3schools.com/jsref/obj_window.asp):
```
    window
```
        Results:
        Shows avaliable functions
> The window object represents an open window in a browser.
>
> If a document contain frames (iframe tags), the browser creates one window object for the HTML document, and one additional window object for each frame.
```
    window.document
```
        Result:
        Returns the Document object for the window 

> When an HTML document is loaded into a web browser, it becomes a document object.
>
> The document object is the root node of the HTML document.

```
    document.getElementById
```
from [W3Scholls](https://www.w3schools.com/jsref/met_document_getelementbyid.asp):

> The getElementById() method returns the element that has the ID attribute with the specified value.
> 
> This method is one of the most common methods in the HTML DOM, and is used almost every time you want to manipulate, or get info from, an element on your document.
> 
>Returns null if no elements with the specified ID exists.
>
> An ID should be unique within a page. However, if more than one element with the specified ID exists, the getElementById() method returns the first element in the source code.

from [Cursera](https://www.coursera.org/learn/html-css-javascript-for-web-developers/lecture/5Nk45/lecture-53-part-1-dom-manipulation):

        HTML file:
```html
    <!DOCTYPE html>
    <html lang="en">
    <head>
        <meta charset="UTF-8">
        <script src="js/script.js"></script>
    </head>
    <body>
        <h1 id="title">Lecture 53</h1>
        <p>
            Say Hello to
            <input id="name" type="text">
            <button>Say it!</button>
        </p>
        <div id="content"></div>

    </body>
    </html>
        
```
        Script:
    
```js
    console.log(document.getElementById("title"));
```
        Result:
        null

> Place scripts tags in top, after the header, is used to modify stylesheets
>
> To use javaScript for a behavior, it must be placed in the final of the body of the html document

        HTML File:
```html
  <!DOCTYPE html>
    <html lang="en">
    <head>
        <meta charset="UTF-8">
    </head>
    <body>
        <h1 id="title">Lecture 53</h1>
        <p>
            Say Hello to
            <input id="name" type="text">
            <button>Say it!</button>
        </p>
        <div id="content"></div>

        <script src="js/script.js"></script> 
    </body>
    </html>
```
        Behavior script:
```js
    console.log(document.getElementById("title"));
```
        Result:
        <h1 id="title"> ...

```js
    console.log(document instanceof HTMLDocument);
```
        Result:
        true

From [W3Schools](https://www.w3schools.com/java/ref_keyword_instanceof.asp)

> The instanceof keyword checks whether an object is an instance of a specific class or an interface.
>
> The instanceof keyword compares the instance with type. The return value is either true or false.

See [W3Schools - HTMLDocument documentation](https://www.w3schools.com/jsref/dom_obj_document.asp)

