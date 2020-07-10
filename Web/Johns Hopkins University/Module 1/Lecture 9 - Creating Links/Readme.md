### Creating Links
##
> *Href - Hipertext Reference*
##
###### Internal Links:

```html
    <!DOCTYPE html>
    <html lang="en">
    <head>
        <meta charset="UTF-8">
        <title>Internal Links</title>
    </head>
    <body>
        <h1>Internal Links</h1>
        <section>
            We can link to a file in the same directory as this HTML file, like this:
            <a href="same-directory.html" title="same dir link"> Linking file im same directory</a>

            <a href="same-directory.html" title="same dir link">
                <div>Div Linking file im same directory</div>
            </a>
        </section>
    </body>
    </html>

```
#
> The same-directory page will looks like this:

```html
    <!DOCTYPE html>
    <html lang="en">
    <head>
        <meta charset="UTF-8">
        <title>Same directory as Links-internal.html</title>
    </head>
    <body>
        <h1>Same directory as Links-internal.html</h1>

        <a href="links-internal.html" title="back to main page">
            <div>Back to main page</div>
        </a>

    </body>
    </html>

```
> *The a element can be a flow content or a Phrasing content*
> 
> *It is a inline and a block content at same time* 
>
> *It allows to having a div inside 'a' tag*
##
###### External Links:
```html
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>External Links</title>
</head>
<body>
    <h1 id="top">External Links</h1>
    <section>
        <p>
            Let&lsquo;s link to my Github repository
            <!-- link to my github page with target -->
            <a href="https://github.com/M4NS0" target="_blank" rel="Click here"> My Repository</a>
        </p>
    </section>
</body>
</html>

```
> *_blank is used to open in another tab*
#
###### Same page Links:

```html
    <!DOCTYPE html>
    <html lang="en">

    <head>
        <meta charset="UTF-8">
        <title>Links to Sections of Same Page</title>
    </head>

    <body>
        <h2 id="top">Links to Sections of Same Page</h2>
        <section>
            <ul>
                <li><a href="#section1">Section 1</a></li>
                <li><a href="#section2">Section 2</a></li>
                <li><a href="#section3">Section 3</a></li>
                <li><a href="#section4">Section 4</a></li>
                <li><a href="#section5">Section 5</a></li>
                <li><a href="#section6">Section 6</a></li>
            </ul>
        </section>
        <section id="section1">
            <h3> Section 1</h3>
            <p> bla-blas sec 1 </p>
        </section>
        <section id="section2">
            <h3> Section 2</h3>
            <p> bla-blas sec 2 </p>
        </section>
        <section id="section3">
            <h3> Section 3</h3>
            <p> bla-blas sec 3 </p>
        <section id="section4">
            <h3> Section 4</h3>
            <p> bla-blas sec 4 </p>
        </section>
        <section id="section5">
            <h3> Section 5</h3>
            <p> bla-blas sec 5 </p>
        </section>
        <section id="section6">
            <h3> Section 6</h3>
            <p> bla-blas sec 6 </p>
        </section>
        <a href="#top">Back to top</a>
    </body>
    </html>

```