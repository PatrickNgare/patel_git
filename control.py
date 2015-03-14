num=45
guess =int(input('Enter an integer: '))

if guess==num:
	print('congratulations,you guessed it.')
	print('(but you dont win prizes!)')
elif guess<num:
	print('no it is a little higher than that')
else:
	print('it is a little lower than that')
	print('Done')