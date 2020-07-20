### Media Query Syntax

```css 
    @media (max-width: 767px) {
        p {
            color:blue;
        }
    }
```
> Media Feature  *(max-width: 767px)*
> - *resolves to true or false*
> - *if it's true it will apply the code bellow it*
> 
> *It's a stylesheet withing a stylesheet*
>
> Exemples of Media Query Common Features:

```css
    @media (max-width: 800px) {...}
```

```css
    @media (min-width: 800px) {...}
```

```css
    @media (orientation: portrait) {...}
```

```css
    @media screen {...}
```

```css
    @media print {...}
```
> Devices with width within a range:

```css
    @media (max-width: 768px) and (max-width: 991px) {...}
```
> Comma is equivalent to OR:
```css
    @media (max-width: 767px) , (max-width: 992px) {...}
```
> Usage:
```css

    
    p {color:blue;} /* starts with the base styles: */

    (...)

    @media (min-width: 1200px) { ... }
                         ^
    @media (max-width: 992px) and (max-width: 1199px) {...}
                                                ^
```
> *Careful not to overlap range boudaries*