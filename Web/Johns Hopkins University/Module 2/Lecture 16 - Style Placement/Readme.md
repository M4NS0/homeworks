### Style Placement

* Placing styles inline is great for quick testing
* Real sites almost use external styles
* Head styles are usually there to everride external ones


>Your choice for placing styles in one versus another place doesn't only affect how **reusable** the styles are
>
> It also affects which style declarations override other style  declarations
>
> For example, you could specify a CSS style directly on the element by providing the style attribute and the CSS styles that should apply to that style.

```html
    <h2> SEE EMILY PLAY</h2>
    <h2>(Single)</h2>
    <p style="text-align: right;">
        <br>Emily tries but misunderstands, ah ooh
        ... 
    </p>
```
> as above, an exemple of inline style
> 
> *this is the least reusable way of styling elements there is*
> 
> *Is commonly used to test a style before the implementation*

#
###### External Stylesheets
```html
    <link rel="stylesheet" href="style.css">    
```
> *Should be use after the title*
> *Css documents contains all style configurations*
