## Useful Linux Stuff

|Subject                 |Shortcut|
|------------------------|--------|
|Screen Brightness       |<a href="https://github.com/M4NS0/Workspaces/tree/master/Linux#screen-brightness"><img src="https://github.com/M4NS0/Workspaces/blob/master/Web/Johns%20Hopkins%20University/github.png" style="width:8px; height:12px" title="Screen Brightness" alt="Screen Brightness"></a> |
|One Line Update/Upgrade |<a href="https://github.com/M4NS0/Workspaces/tree/master/Linux#one-line-updateupgrade"><img src="https://github.com/M4NS0/Workspaces/blob/master/Web/Johns%20Hopkins%20University/github.png" style="width:8px; height:12px" title="One Line Update/Upgrade" alt="One Line Update and Upgrade"></a> |
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>

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

###### One Line Update/Upgrade

```sh
$ sudo apt update -y && sudo apt full-upgrade -y && sudo apt autoremove -y && sudo apt clean -y && sudo apt autoclean -y
```


