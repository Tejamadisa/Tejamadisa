FROM nginx:alpine

RUN rm -rf /usr/share/nginx/html/*

COPY lion-site.html /usr/share/nginx/html/index.html

# Fix permissions so nginx can read the file
RUN chown nginx:nginx /usr/share/nginx/html/index.html \
 && chmod 644 /usr/share/nginx/html/index.html

EXPOSE 80

CMD ["nginx", "-g", "daemon off;"]