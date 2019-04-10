# gf-book-scenarios

Use the files in this repository to complete your work in this course going forward.

Be sure to commit your work frequently; as discussed in class, this can serve as a way to "take notes" when we write code together.

## Install the shortcut

To use the `./acp` shortcut, copy and paste these commands into your Terminal window in the `gf-book-scenarios` folder:

```
rm -rf acp
echo -e 'acp' >> .gitignore
echo -e '#!/bin/bash' >> acp
echo -e 'git add *' >> acp
echo -e 'git commit -m "$1"' >> acp
echo -e 'git push -u origin master' >> acp
chmod +x acp
```
