<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="jakarta.tags.core" %>

<!DOCTYPE html>
<html>
    <head>
        <title>Login</title>
        <link href="https://cdn.jsdelivr.net/npm/tailwindcss@2.2.19/dist/tailwind.min.css" rel="stylesheet">
    </head>
    <body>
        <div class="h-screen flex items-center justify-center bg-gray-100">
            <form action="login" method="post" class="bg-white p-8 rounded shadow-md w-full max-w-sm">
                <h2 class="text-2xl font-semibold mb-6 text-center">Task Board</h2>
                <input type="email" name="email" placeholder="E-mail" class="w-full mb-4 p-2 border rounded" required>
                <input type="password" name="senha" placeholder="Senha" class="w-full mb-4 p-2 border rounded" required>
                <button type="submit" class="w-full bg-blue-600 text-white py-2 rounded hover:bg-blue-700">Entrar</button>
                <p class="mt-4 text-center text-sm">
                    Não tem uma conta?
                    <a href="cadastro.jsp" class="text-blue-600 underline">Cadastre-se aqui</a>
                </p>
            </form>
        </div>
    </body>
</html>