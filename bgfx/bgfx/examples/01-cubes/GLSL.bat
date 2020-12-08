shaderc -f vs_cubes.sc -o .\glsl\vs_cubes.bin --depends -i ..\..\src --varyingdef varying.def.sc --platform linux -p 430 --type vertex -O3
shaderc -f fs_cubes.sc -o .\glsl\fs_cubes.bin --depends -i ..\..\src --varyingdef varying.def.sc --platform linux -p 430 --type fragment -O3
pause