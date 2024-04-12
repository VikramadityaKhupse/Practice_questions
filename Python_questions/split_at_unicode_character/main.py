def splitAtUniode(text: str, unicode_char: str):
    # Encode the text and unicode character to bytes for character-level splitting
    text_bytes = text.encode('utf-8')
    unicode_char_bytes = unicode_char.encode('utf-8')

    # Split the bytes using the byte representation of the unicode character
    split_parts = text_bytes.split(unicode_char_bytes)

    # Decode the split parts back to strings
    return [part.decode('utf-8') for part in split_parts]


# Example usage
texts = ["0␞@USER She should ask a few native Americans what their take on this is.␞OFF␞en",
        "1␞@USER @USER Go home you’re drunk!!! @USER #MAGA #Trump2020 👊🇺🇸👊 URL␞OFF␞en",
        "2␞Amazon is investigating Chinese employees who are selling internal data to third-party sellers looking for "
        "an edge in the competitive marketplace. URL #Amazon #MAGA #KAG #CHINA #TCOT␞NOT␞en",
        "3␞\"@USER Someone should'veTaken"" this piece of shit to a volcano. 😂""\"␞OFF␞en",
        "4␞@USER @USER Obama wanted liberals &amp; illegals to move into red states␞NOT␞en",
        "5␞@USER Liberals are all Kookoo !!!␞OFF␞en",
        "6␞@USER @USER Oh noes! Tough shit.␞OFF␞en",
        "7␞@USER was literally just talking about this lol all mass shootings like that have been set ups. it’s "
        "propaganda used to divide us on major issues like gun control and terrorism␞OFF␞en"]
unicode_char = chr(0x241E)  # Character representation of U+241E
# print(unicode_char)
splitted_text_list = [splitAtUniode(text, unicode_char) for text in texts]
print(splitted_text_list)

