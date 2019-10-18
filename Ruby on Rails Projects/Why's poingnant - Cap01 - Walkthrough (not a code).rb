5.times { print "\nOdeleay!"}
5.times { print "Odeleay!"}

# Variables
teddy_bear_fee = 122.08
lowercaseallways = true

# Numbers
do_not_use_commas = true
population_numbers_can_uses_underscores = 12_000_000
floating_contains_decimals = -3.14

# Strings
sealab_2021 = "\nThese cartoons are hilarious!"
print(sealab_2021)

# Symbols
# words that looks like variables
# they may contain letters, digits and underscores
# you may use it like a string but it won't print at all

:a == "can be a string"
:b == "also can be a string"
:ponce_de_leon == "too"

# Constants
# are capitalized
# are the proper nouns of ruby

EmpireStateBuilding = "350 5th Avenue, NYC,NY"
Goiânia = "hatefull city!"

# Methods
# are the Verbs in Ruby
# usually attached in the end of the variables and constants by DOT

front_door.open
front_door.open.close
# can chain actions as above
front_door.is_open?

# Method Arguments
front_door.paint(3, :red)
# the above paints the front door 3 coats of red
front_door.paint(3,:red).dry(30).close()
# the above paints the front door 3 coats of red dry for 30 days and close the door

# Class Methods
# usually atached after variables and constants
# rather than a dot, a double colon

Door::new( :oak)
# above means: ruby, i want a new oak door
# new is used to create things

# GLobal Variables
# begins with dollar sign
# can  guarantee all same variables in diferent methods
$x
$1
$chunky
$CHunkY_baC0n

# Instance Variables
# beggins with at symbol
# variables that defines attributes of something
@x
@y
@only_the_chunkiest_cut_of_bacon_I_have_ever_seen

# Class Variables
# uses the double at
# used to define attributes
# double at is equals to attribute all
@@x
@@y
@@i_will_take_your_chunky_bacon_and_raise_you_two

# Blocks
# any code sourrounded by curly braces
# group and set instructions together
2.times {print "Yes, I've used chunky bacon in my examples, but never again!" }

# curly braces can be traded by 'do' and 'end'
loop do
  print "Much better"
  print "Ah! More Space"
  print "My back was killin' me in those crab pincers."
end

# Block Arguments
# sourrounded by pipe characters and separeted by commas
|x|
|x,y|
|x,y,up_down_and_around|
# Block arguments are used at the beginning of a block.
{ |x,y| x + y }
# Pipes are passageway between blocks and the world around them.
# looks like the variables are sliding down with a  parachoute through the tunnel into the block

# Ranges
# are sourrounded by parentheses and separated by an ellipsis in form of two or three dots
(1..3) # is a range represents one to three
('a'..'z') # is a range represents 'a' to 'z'
(0...5) # is like an accordion

# Arrays
# sourrounded by square brackets
# searate by commas
[1,2,3]
['coat', 'mittens','snowboard'] # is an array of strings
carterpillar = ['head','commas are legs','more legs','bum']

# Hashes
# harsh dictionaries are sourrounded by curly brackets
# can match words to their definitions using '=>'
{'a' => 'aardvark', 'b' => 'badger'}
# curly brackets representing opening and closing a dictionary
{
  'name' => 'Peter'
  'profession' => 'Lion tamer'
  'great love' => 'flannel'
}
# carefull while comparing dictionaries and hashes, because hashes only carry definitions
