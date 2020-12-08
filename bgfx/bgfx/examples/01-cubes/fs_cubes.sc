$input v_color0
#extension   GL_NV_shader_thread_group : require
uniform uint  gl_WarpSizeNV;	// 单个线程束的线程数量
uniform uint  gl_WarpsPerSMNV;	// 单个SM的线程束数量
uniform uint  gl_SMCountNV;		// SM数量

in uint  gl_WarpIDNV;		// 当前线程束id
in uint  gl_SMIDNV;			// 当前线程所在的SM id，取值[0, gl_SMCountNV-1]
in uint  gl_ThreadInWarpNV;	// 当前线程id，取值[0, gl_WarpSizeNV-1]
/*
 * Copyright 2011-2020 Branimir Karadzic. All rights reserved.
 * License: https://github.com/bkaradzic/bgfx#license-bsd-2-clause
 */

#include "../common/common.sh"

void main()
{
	float lightness = gl_WarpIDNV * 1.0f / gl_WarpsPerSMNV;;
	gl_FragColor = vec4(gl_WarpIDNV, lightness, lightness, 1);
}
