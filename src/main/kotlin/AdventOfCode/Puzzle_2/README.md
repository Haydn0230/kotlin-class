# Example data

```aidl
forward 5
down 5
forward 8
up 3
down 8
forward 2
```

# Puzzle 1
Get a running depth + horizontal position from the data.

```
depth = down - up
horizontal = forward 
```
### What do you get if you multiply your final horizontal position by your final depth?

# Puzzle 2
Get a running depth + horizontal and aim position from the data

```
depth = down - up
aim = down - up
horizontal = forward * aim
```
### What do you get if you multiply your final horizontal position by your final depth?

