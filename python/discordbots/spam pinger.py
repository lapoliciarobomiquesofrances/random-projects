import discord
import time

#How to use:
#Get the target's discord id and put it where the user id tag is. Do NOT delete the <@ and >
#put your bot token where it says bot token here
#run the bot and send a message that is $jaja

intents = discord.Intents.default()
intents.message_content = True

client = discord.Client(intents=intents)

@client.event
async def on_ready():
    print(f'We have logged in as {client.user}')

@client.event
async def on_message(message):
    if message.author == client.user:
        return

    if message.content.startswith('$jaja'):
        count = 1
        while (count == 1):
            time.sleep(0.6)
            await message.channel.send('<@user id here>')


client.run('bot token here')
