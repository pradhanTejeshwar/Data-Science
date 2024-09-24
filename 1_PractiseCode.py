def sentence_generator(phrase):
    interrogatives=("how","why","where","when","what")
    capitalised = phrase.capitalize()
    if phrase.startswith(interrogatives):
        capitalised=capitalised+"?"
    else:
        capitalised=capitalised+"."
    return capitalised

sentence = []
while True :
    phrase = input("Say Something :")
    if phrase == "\end":
        break
    else: 
        sentence.append(sentence_generator(phrase))

print(" ".join(sentence))



# while str != "\end" :
#     str = input("Say Something :")
#     word = {"how", "why", "where", "when"}
#     if word in str :
#         str = str + "?"
#     else:
#         str = str + "."
#     str = str.title
# snt = snt + str