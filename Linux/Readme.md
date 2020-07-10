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
	$ xrandr --output Target-Screen-Here --brightness Numeral-Value
```
> Exemple:
```sh
	$ xrandr --output HDMI-0 --brightness 1
	$ xrandr --output DVI-1 --brightness 0.8
```

