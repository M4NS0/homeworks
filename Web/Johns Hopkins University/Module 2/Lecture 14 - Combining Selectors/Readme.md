## Combining CSS Selectors

- Element with class Selector (selector.class)
- Child (direct only) selector (selector > selector)
- Descendent selector (selector selector)
#

###### Class Selector:
```css
    p.big {
        font-size: 20px;
    }
```
> *Reading Right to Left:
> Every p that has class="big"*
> 
> *The lack od space between 'p.big' if the opposite happens will cssow up a completely different combination* 
>
> The code:

```html
    ...
    <p class="big"> Text size here will be 20px </p>
    <div class="big"> Unnaffected by CSS </div>
    ...

```
#
###### Child Selector:
```css
    article > p {
        color:blue;
    }
```
> *Reading Right to Left: 
> Every p that is a direct child of article*
>
> The code:
```html
    ...
    <article> ...
        <p> Blue Text here </p>
    </article>
    ...
    <p> Unnaffected by CSS </p>
    <article> ... 
        <div> <p> Unnaffected by CSS (not a direct child of it) </p></div>
    </article>
    ...

```
#
###### Descendant Selector:
```css
    article p {
        color: blue;
    }

```
> *Reading Right to Left:
> Every p that is inside (at any level) of article*
>
> The code:
```html
    ...
    <article> ...
        <p> Blue Text here </p>
    </article>
    ...
    <p> Unnaffected by CSS </p>
    <article> ... 
        <div> <p> Blue Text here </p></div>
    </article>
    ...

```
###### Exemples:
```css 
    .colored p {
        color: blue;
    }
```
> *Reading Right to Left:
> Every p that is inside (at any level) an element with class="colored"*
#

```css 
    .colored>p {
        color: blue;
    }
```
> *Reading Right to Left:
> Only p that is direct child of class="colored"*

#
```css 
    article > .colored {
        color: blue;
    }
```
> *Every element with class="colorized" that is direct child of article element*

### To see about:
- Adjacent sibling selector (selector + selector)
- General sibling selector (selector ~ selector)
# 
# 