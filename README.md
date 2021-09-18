# AcmeDocs

This is a sample Maven project that has a site pushed to Github Pages.

The live site is setup using Github Actions when changes are made to the `main` branch.

The example site is used as an example for generating always up to date documentation. Code is edited in java files, and referenced in the site pages. See the maven site snippet macro for additional details.

This technique can be used to ensure documentation on how to use a library is always accurate, and providing code that is functional. 

## Only include what's required in the docs
Sometimes, to be brief, docs and guides include minimial snippets of code. This can be frustrating when the snippet refers to an ambigious class name - as the guide would be _overly verbouse_ to include all of the import lines. This isn't a problem when you can check the full source code being referenced.
