FROM node:20-slim

WORKDIR /app

COPY . .

# RUN npm install

# 기본적으로 추천하는 방식
RUN ["npm", "install"] 

# 없어도 되는 코드
EXPOSE 8080

# 서버 띄우는 코드
CMD ["node", "server.js"]
# == ENTRYPOINT ["node", "server.js"]