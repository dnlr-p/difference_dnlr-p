double baseSize = 40;
// create CSG shapes

// create CSG shape - a cube
CSG cube = new Cube(baseSize,// X dimention
			baseSize,// Y dimention
			baseSize//  Z dimention
			).toCSG()
// create CSG shape - a sphere
CSG sphere = new Sphere(baseSize/20*12.5).toCSG()
CSG sphere2 = new Sphere(baseSize/20*6).toCSG()

// perform operations

// perform operation - a union
CSG cubePlusSphere = cube.difference(sphere)
CSG cubePlusSphere2 = cube.difference(sphere2)
CSG spherePlusSphere1 = sphere.difference(sphere2)

// move shapes

// move cube
cubeExample = cube.movex(baseSize*1.5)

// move sphere
sphereExample = sphere.movey(baseSize*1.5)
sphere2Example = sphere2.movey(baseSize*7)
spherePlusSphereMoved = spherePlusSphere1.movey(baseSize*7)
spherePlusSphereMoved2 = spherePlusSphere1.movey(baseSize*3)

return [cubePlusSphere, cubeExample, sphereExample, sphere2Example, spherePlusSphereMoved, spherePlusSphereMoved2.movey(2)]