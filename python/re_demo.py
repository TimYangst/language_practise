import re

# Text to search
text = "Hello, my email is example@example.com"

# Define a pattern to match email addresses
pattern = r"\b[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\.[A-Za-z]{2,}\b"

# Search for the pattern in the text
match = re.search(pattern, text)

# Check if a match is found
if match:
    email = match.group()
    print("Found email:", email)
else:
    print("No email found.")
