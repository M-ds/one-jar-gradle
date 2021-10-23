/*
This will set the port to 3000 so we don't collide with the Spring Boot application.
Next you're setting a proxy so that any request that starts with /api will be forwarded to http://localhost:8080.
This means that you don't have to worry about setting up different environment variables for development and production.
 */
module.exports = {
  // https://cli.vuejs.org/config/#devserver-proxy
  devServer: {
    port: 3000,
    proxy: {
      '/api': {
        target: 'http://localhost:8080',
        ws: true,
        changeOrigin: true
      }
    }
  }
}
