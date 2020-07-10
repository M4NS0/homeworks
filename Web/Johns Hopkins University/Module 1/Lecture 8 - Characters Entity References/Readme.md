### HTML Character Entity References
##
>  *Help to avoid rendering issues*
> 
>  *Safeguard against more limited character encoding*
> 
>  *Provide characters not avaliable on a keyboard*
## 


<img src="https://github.com/M4NS0/Workspaces/blob/master/Web/Johns%20Hopkins%20University/Lecture%208%20-%20Characters%20Entity%20References/Character%20Entities.png" width="50%" height="auto" />


 *Common HTML entities used for typography:* [W3C](https://www.w3.org/wiki/Common_HTML_entities_used_for_typography)
## 
> A wrong exemple of use:

```html

    <!DOCTYPE html>
    <html lang="en">
    <head>
        <meta charset="UTF-8">
        <title>HTML Entities</title>
    </head>
    <body>
        <h1>Lorem ipsum dolor sit amet, < consectetur adipiscing > &  elit: </h1>
        <p>Donec malesuada viverra urna, eu consectetur ante placerat eu. 
        </p>
        <p>Lorem Ipsum Generator</p>
    </body>
    </html>

```
## 

> *The result will supress all content between '<' and '>'*
> 
> - *Copyright character can be used by typing '& copy;'*
> - *Not blank space '& nbsp;' can be used to avoid unwanted wrapping words*
> 
> *The right way to use these characteres:*
```html
    <!DOCTYPE html>
    <html lang="en">
    <head>
        <meta charset="UTF-8">
        <title>HTML Entities</title>
    </head>
    <body>
        <h1>Lorem ipsum dolor sit amet, &lt; consectetur adipiscing &gt; &amp; elit: </h1>
        <p>"Donec malesuada viverra urna, eu consectetur ante&nbsp;placerat&nbsp;eu."
        </p>
        <p>Lorem Ipsum Generator 2020 &copy Copyright</p>
    </body>
    </html>
```
## 
> *Is a bad practice using '& nbsp;' to have blank spaces between words*
> 
> *A good Practice is adding a span tag surrounding the word and a stylesheet to apply margins left and right*

```html
    " Donec malesuada <span style="margin-left:30px;margin-right:30px;">viverra urna,</span> eu consectetur ante placerat eu. "

```
## 
> Quotes can looks funny after using another encode on browser, to solve, quotes can be put this way:
```html
    &quot;Donec malesuada viverra urna, eu consectetur ante placerat eu.&quot;
```
> Finally, with all implementations, the code will looks like this:
```html
    <!DOCTYPE html>
    <html lang="en">

    <head>
        <meta charset="UTF-8">
        <title>HTML Entities</title>
    </head>
    <body>
        <h1>Lorem ipsum dolor sit amet, &lt; consectetur adipiscing &gt; &amp; elit: </h1>
        <p>&quot;Donec malesuada <span style="margin-left:30px;margin-right:30px;">viverra urna,</span> eu consectetur ante&nbsp;placerat&nbsp;eu.&quot;
        </p>
        <p>Lorem Ipsum Generator 2020 &copy Copyright</p>
    </body>
    </html>

```


