!/bin/bash

path="$(pwd)"

echo "Path in test1 = $path"

cd ..

echo "invoking next script from path $(pwd)"

./test2.sh
