## Useful Linux Stuff
###### Screen Brightness
1. To recognize the connected screens, run:
```sh
	$ xrandr -q
	# Or
	$ xrandr --listactivemonitors
```
2. Use the command with syntax: 
```sh
	$ xrandr --output Target-Screen --brightness Numeral-Value (x.x)
	$ xrandr --output Target-Screen --gamma Numeral-Group(x.xx:x.xx:x.xx)
```
> Exemple:
```sh
	$ xrandr --output HDMI-0 --brightness 1
	$ xrandr --output DVI-1 --brightness 1
	$ xrandr --output HDMI-0 --gamma 0.8:0.8:0.75

```

