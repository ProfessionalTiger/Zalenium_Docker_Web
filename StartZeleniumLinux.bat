
docker run --rm -ti --name zalenium -p 4444:4444 -v /var/run/docker.sock:/var/run/docker.sock -v /c/Users/Amir/temp/videos:/Users/Amir/temp/videos --privileged dosel/zalenium start 