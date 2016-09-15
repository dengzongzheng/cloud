requirejs.config({
    baseUrl: '/static/js',
    paths: {
        jquery: [
            'http://apps.bdimg.com/libs/jquery/1.11.3/jquery.min',
            'lib/jquery/jquery-1.11.3.min'
        ],
        bootstrap:'lib/bootstrap/bootstrap.min'
    },
    shim: {
        'jquery': {exports: '$'},
        "bootstrap":["jquery"]
    }
});
