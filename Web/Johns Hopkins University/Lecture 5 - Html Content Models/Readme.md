## HTML Content Models

What elements must be nested inside other elements
Block element or inline elements?

### Block-Level Elements
- Render to begin a new line (by default)
- May contain inline or other block-level elements
- Roughly Flow Content (HTML5 category)

### Inline Elements
- Render in same line (by default)
- May only contain other inline elements
- Roughly Phrasing Content (HTML5 category)

### 

> *Html5 replaces these definitions with more complex set of content categories.*
> *This distinction remeins practical because it aligns well with existing CSS rules*
  
```sh
    <!DOCTYPE html>
    <html lang="en">
    <head>
        <meta charset="UTF-8">
        <title>Div and Span Elements</title>
    </head>
    <body>
        <div>*** Div 1: Your bla-bla here ***</div>
        <div>*** Div 2: After Div 1 ***</div>
        <span>*** Span 2: After Div 2 ***</span>
        <div>*** Div 3: After Span 1 ***
            <span>*** Span 2: Inside Div 3 ***</span> Continue content of div 3 ***
        </div>
    </body>
    </html>
```

> - *The div and span element are the most generical*
> - *Div means division*
> - *Div is most generical block-level element*
> - *Span is the supergenerical inline element*

```sh
    <!DOCTYPE html>
    <html lang="en">
    <head>
        <meta charset="UTF-8">
        <title>Div and Span Elements</title>
    </head>
    <body>
        <div>*** Div 1: Your bla-bla here ***</div>
        <div>*** Div 2: After Div 1 ***</div>
        <span>*** Span 2: After Div 2 ***</span>
        <div>*** Div 3: After Span 1 ***
            <span>*** Span 2: Inside Div 3 ***
            <div> Bad Div inside a Spam </div>
            </span> Continue content of div 3 ***
        </div>
    </body>
    </html>
```

> - *Above a bad insertion of a div inside a span*
> - *It generates the following error:*
```sh
    Error: Element div not allowed as child of element span in this context. (Suppressing further errors from this subtree.)

    From line 13, column 13; to line 13, column 17

              <div> Bad D

    Contexts in which element div may be used:
    Where flow content is expected.
    As a child of a dl element.
    Content model for element span:
    Phrasing content.

```

See kinds of contents on infographic on *[Markup Validation Service](https://www.w3.org/TR/2011/WD-html5-20110525/images/content-venn.svg)*

[![Infographic](/Lecture%205%20-%20Html%20Content%20Models/infographic.png)
#  
#  

  ** *Roughly  - aproximadamente*  
  ** *Phrasing - fraseado*
  ** *Span - período*  

