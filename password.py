import random
import string

# Generate password
lower = string.ascii_lowercase
upper = string.ascii_uppercase
digits = string.digits
special = "!@#$%&*"

password = [
    random.choice(upper),
    random.choice(special),
    random.choice(lower),
    random.choice(digits)
]

# Add 4 more random characters
all_chars = lower + upper + digits + special
for _ in range(4):
    password.append(random.choice(all_chars))

random.shuffle(password)
password = ''.join(password)

print("Your strong password:", password)
