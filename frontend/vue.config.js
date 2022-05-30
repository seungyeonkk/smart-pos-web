const { defineConfig } = require("@vue/cli-service");
module.exports = defineConfig({
  transpileDependencies: true,
  lintOnSave: false,
  outputDir: '../src/main/resources/static/vue', // 빌드한 파일이 위치 할 경로
  devServer: {
    port: 18700,
    proxy: {
      '/api': {
        target: 'http://localhost:18600'
      }
    }
  },
});
