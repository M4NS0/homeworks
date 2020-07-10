### Element, Class and ID Selectors
#
###### Element Selector
```css
    p {
        color:blue;
    }
```
> Can contains other types of selectors, like:
> - html,body,head,title...
> - h1,h2,h3...
> - table, form, iframe...
#
###### Class Selector

```css
    .blue {
        color: blue;
    }
```
> Class name is defined by a dot 
>
> *To apply, line beyond must appear in html code part that needs to be stylized:*
```html
    ...
    <p> Unnaffected by CSS <p>
    <p class="blue">  Blue text will show up here  </p>

    # or/and
    <p> Unnaffected by CSS <p>
    <div class="blue"> Blue text will show up here </div>
    ...

```
# 

###### Id Selector

```css
    #name {
        color: blue;
    }
```
> *Name is a value of some id in html document*
> *Defined by #*
>
> *To apply, line beyond must appear in html code part that needs to be stylized:*
```html
    ...
    <p> Unnaffected by CSS <p>
    <div id="name"> Blue text will show up here </div>
    ...

```
#
###### Grouping Selectors

```css
    div, .blue {
        color: blue;
    }
```
> *Selectors can be group to share the same attributes*
>
> *Those selectors must be separated by commas*
```html
    ...
    <p class="blue"> Blue text will show up here </p>
    <p> Unnaffected by CSS </p>
    <div> Blue text will show up here </div>
    ...

```