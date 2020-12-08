shaderc -f vs_cubes.sc -o .\dx11\vs_cubes.bin --depends -i ..\..\src --varyingdef varying.def.sc --platform windows -p vs_4_0 -O 3 --type vertex -O3
shaderc -f fs_cubes.sc -o .\dx11\fs_cubes.bin --depends -i ..\..\src --varyingdef varying.def.sc --platform windows -p ps_4_0 -O 3 --type fragment -O3
pause