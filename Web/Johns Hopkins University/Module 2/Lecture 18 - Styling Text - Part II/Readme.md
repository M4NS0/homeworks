### Styling Text - Part II

###### Font size

```css
    body {
            font-size: 120%;
    }
```
> *120% of the default font of browser*


```html
    <body>
        <div>Regular Text</div>
        <div>
            <div style="font-size: 2em">2em text
                <div style="font-size: 2em"> 4em text
                    <div style="font-size: .5em">2em again!</div>
                </div>

    </body>
```
> *2em is related to the width of font. Is a relative size to something*
> *In case, it means that all fonts in body have to have 2x the size of 120% of the default* 
> *In the 4em line, the 2em style is relative to the 2em text above of it*
> *The second and third divs below are childs of the first div so they inherit the size*
> *To re-set to a minnor font size, since they have inherit, it must be decreased*
>
> *Percentages could be used in stead of ems, so 2em can be a 200% over the body font-size*

