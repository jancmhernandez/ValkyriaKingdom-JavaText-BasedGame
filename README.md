VALKYRIA KINGDOM

Developed by: Hernandez, Jan Cedric

1.	Project Description
The Valkyria Kingdom is a text-based and turn-based game featuring a sparring battle between two (2) elemental mages. With three available elements to specialize on, the user’s and bot’s characters can choose from four (4) offensive and three (3) defensive spells in every turn. The characters need to strategize to reduce the foe’s health points (HP) before their own HP level depletes. The players also need to consider how to maximize their mana point (MP) levels as these are the requirement to cast normal and elemental spells.

2.	Story
In the Valkyria Kingdom, few individuals are born with the power of magic. With little time remaining before the elves try to conquest your land, you are tasked to master how to utilize the full potential of your spells.
Queen Erystrazsa commanded every mage in the kingdom to specialize with a single element to maximize the full potential of their magic. To do this, she wants to assess the combat level of her mages by conducting a one-on-one magic duel. Throughout the sparring session, Queen Erystrazsa will be observing how you will survive an arcane mage.

3.	Character

The character name “Queen Erystrazsa" is often mentioned throughout the story. As the story revolves around how Queen Erystrazsa wants to prepare her kingdom’s mages, she is greatly involved in the sparring battle between the user and the bot.

Depending on the user's discretion of difficulty, the opponent will be one of the three (3) arcane mages of different elements. 
	Agni, the fire-based elemental mage. 
	Varuna, the water-based elemental mage.
	Gandharva, the nature-based elemental mage.

The game was designed with the elemental advantage system wherein fire-based spells have an advantage on nature mages, water-based spells on fire mages, and nature-based spells on water mages. If the user chose the easy difficulty, the opponent will be the element without elemental advantage against the chose element of the user. Choosing the difficult version, the user will face the opponent who has an elemental advantage on their character.

4.	Gameplay

4.1.	Game Navigation
As the game is text-based, the user only needs to enter a few characters to navigate. There are prompts in every situation wherein users need to press some keys. Most of the time, the users need to press the number of choices and then the enter key whenever the prompts state "Type the number of choice and press "ENTER"...” or “TYPE THE NUMBER OF SPELL AND PRESS "ENTER" … " In some instances, the user just needs to press the Enter key in situations where the prompt says "Press "ENTER" to continue..." Lastly, the user will be required to enter the name at the start of the game. In this instance, the name should just be typed before pressing the Enter key.

4.2.	Goals
In every single matchup, the goal of each character is to inflict enough damage to the opponent until their HP reached 0. The first character to do this wins the magic sparring session.  With several spells to choose from, the user can strategize when to use offensive spells, utilize the healing move, generate a shield, and charge their MP.

4.3.	User’s and Opponent’s Skills

Within the game, both the user and the bot can choose from casting a basic attack, normal spell, elemental spell, ultimate elemental spell, shield spell, MP generation spell, and, healing spell. Depending on the character’s element, the name of moves varies though they have the same damage and MP requirement for each move type. Details are presented in the table.

Actions	Fire Mage	Water Mage	Nature Mage
Basic Attack
(2 normal damage, 0 MP)	Piercing Wand	Piercing Wand	Piercing Wand
Normal Spell
(6 normal damage, 20 MP)	Ash Ball	Mud Ball	Seed Ball
Elemental Spell
(10 elemental damage, 50 MP)	Incinerate	Hydro Cannon	Petal Barrage
Ultimate Elemental Spell 
(20 elemental damage, 75 MP, 20% chance to miss)	Amaterasu	Tidal Storm	Jungle Outburst
Shield Spell 
(forge shield that absorbs 75% of the foe’s next attack)	Molten Shield	Aqua Armor	Wooden Wall
MP Generation Spell 
(generate 10 MP points)		Fire Dance	Water Dance	Leaf Dance
Healing Spell 
(heal 5 HP points)	Pyro-Meditate	Healing Water	Solar Healing

It must be noted that a healing spell will only be available if the character's HP is less than 20.  The shield is stackable and there is a shield limit. When a character with a shield was hit by an elemental spell that has an elemental advantage, the shield will cancel the damage brought by the elemental advantage. On the other hand, the ultimate elemental spell has a 20% chance to miss. If the character failed to complete the spell, he will recover 50 MP. Thus, failing an ultimate elemental spell will lose 25 MP.

4.4.	Game Mechanics
4.4.1.	Throughout the game, CORRECT INPUT IS EXPECTED. Inputting the wrong text character can lead to a lost turn. Be careful in casting spells. If there is not enough MP, the move will be invalid for that specific turn.
4.4.2.	The players will choose their character's element, will give a character name, and set the difficulty of the game.
4.4.3.	Both the character of user and bot starts with 100 HP and 50 MP.
4.4.4.	The user always chooses the first spell before the bot in every turn.
4.4.5.	The HP and MP values are always displayed in their rounded off version.
4.4.6.	There is no maximum MP or MP limit.
4.4.7.	After every turn, both characters gain 10 MP.
4.4.8.	Elemental spells will have 20% additional damage if it has elemental advantage on the opponent’s element. Fire moves have more damage on nature mages, water moves on fire mages, and nature moves on water mages.
4.4.9.	If the difficulty is set to easy mode, the user will have an elemental advantage over the opponent. If the game was set to difficult mode, the opponent will have an elemental advantage on the user.
4.4.10.	The players can experience random encounters if the turn number is divisible by 5. Details are presented in Section 4.5. 
4.4.11.	The game will end if either of the character’s HP is equal or below 0.


4.5.	Random Encounter
If the turn number is divisible by 5, Queen Erystrazsa can appear and do something to spice up the battle after the moves of the 2 characters. All encounters have a 1% chance of happening. Below are all possible events.
•	Queen Erystrazsa fully heal the opponent with her moonlight blessing spell
•	Queen Erystrazsa use moonspark spell to heal the opponent with 5 HP
•	Queen Erystrazsa commanded the bot’s wand to use piercing wand against the user
•	Queen Erystrazsa commanded the bot's wand to use an ultimate elemental spell against the user
•	Queen Erystrazsa commanded the user's wand to use an ultimate elemental spell against the opponent
•	Queen Erystrazsa commanded the user’s wand to use piercing wand against the opponent
•	Queen Erystrazsa use moonspark spell to heal the user with 5 HP
•	Queen Erystrazsa fully heal the user with her moonlight blessing spell

5.	Computer Moves Algorithm
The developer designed the game such that the computer decides its next move depending on the current situation. The figure below shows the decision tree behind the devised algorithm for the action of the user’s opponent.
 
