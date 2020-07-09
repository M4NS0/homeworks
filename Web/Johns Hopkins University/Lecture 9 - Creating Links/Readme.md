### Creating Links
##
> *Href - Hipertext Reference*
##
###### Internal Links:

```sh
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

```sh
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
```sh
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